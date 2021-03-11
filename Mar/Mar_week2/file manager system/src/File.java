public class File {
    private final String name;
    private final String filePath;

    public File(String name,String directoryPath){
        this.name = name;
        filePath = directoryPath+"\\"+getName();
    }

    public String getName() {
        return name;
    }

    public String getFilePath() {
        return filePath;
    }

    @Override
    public String toString() {
        return name;
    }
}
