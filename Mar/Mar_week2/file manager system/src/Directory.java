public class Directory {                //代表一個資料夾當中的所有資訊
    private final Directory parent;            //代表上一層目錄；如果是此資料夾為根目錄，便設為NULL
    private final String name;
    private Directory[] dirList;        //此資料夾中所包含的目錄
    private int directoryCount;            //包含的目錄個數
    private File[] fileList;
    private int fileCount;                //包含的檔案個數
    private final String filePath;

    public Directory(String name) {
        this(name, null);
    }

    public Directory(String name, Directory directory) {
        parent = directory;
        this.name = name;
        dirList = new Directory[2];
        directoryCount = 0;
        fileList = new File[2];
        fileCount = 0;
        if (getParent() == null) {
            filePath = "\\root";
        } else {
            filePath = getParent().filePath + "\\" + getName();
        }
    }

    public String getFilePath() {
        return filePath;
    }

    public Directory getParent() {
        return parent;
    }

    public String getName() {
        return name;
    }

    public void ls() {
        for (int i = directoryCount - 1; i > -1; i--) {
            if (directoryCount == 0) {
                break;
            }
            System.out.println(dirList[i]);
        }
        for (int i = 0; i < fileCount; i++) {
            System.out.println(fileList[i]);
        }
        System.out.println("Total: " + fileCount + " files, " + directoryCount + " directories");
    }

    public Directory cd(String directoryName) {
        for (int i = 0; i < directoryCount; i++) {
            if (dirList[i].getName().equals(directoryName)) {
                return dirList[i];
            }
        }
        return null;
    }

    public void touch(String fileName) {
        if (fileCount == fileList.length) {
            doubleFileList();
        }
        for (int i = 0; i < fileCount; i++) {
            if (fileList[i].getName().equals(fileName)) {
                System.out.println("檔案 " + fileName + " 已經存在");
                return;
            }
        }
        fileList[fileCount++] = new File(fileName, this.filePath);
    }

    public void mkdir(String directoryName) {
        if (directoryCount == dirList.length) {
            doubleDirList();
        }
        for (int i = 0; i < directoryCount; i++) {
            if (dirList[i].getName().equals(directoryName)) {
                System.out.println("子目錄 " + directoryName + " 已經存在");
                return;
            }
        }
        dirList[directoryCount++] = new Directory(directoryName, this);
    }

    public void search(String keyword) {
        if (directoryCount == 0) {
            return;
        }
        for (int i = directoryCount - 1; i > -1; i--) {
            if (dirList[i].getName().contains(keyword)) {
                System.out.println(dirList[i].getFilePath());
            }
        }
        if (fileCount == 0) {
            return;
        }
        for (int i = 0; i < fileCount; i++) {
            if (fileList[i].getName().contains(keyword)) {
                System.out.println(fileList[i].getFilePath());
            }
        }
        for (int i = directoryCount - 1; i > -1; i--) {
            dirList[i].search(keyword);
        }
    }

    public void printFilePath() {
        System.out.println(getFilePath());
    }

    @Override
    public String toString() {
        return "[" + name + "]";
    }

    private void doubleFileList() {
        File[] tmp = new File[fileList.length * 2];
        for (int i = 0; i < fileCount; i++) {
            tmp[i] = fileList[i];
        }
        fileList = tmp;
    }

    private void doubleDirList() {
        Directory[] tmp = new Directory[dirList.length * 2];
        for (int i = 0; i < directoryCount; i++) {
            tmp[i] = dirList[i];
        }
        dirList = tmp;
    }
}
