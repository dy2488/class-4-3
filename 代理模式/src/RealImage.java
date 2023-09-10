public class RealImage implements Image{
    private String fileName;
    public RealImage(String fileName)
    {
        this.fileName=fileName;
        loadFromDisk(fileName);
    }
    private void loadFromDisk(String fileName)
    {
        System.out.println("Displaying"+fileName);
    }

    @Override
    public void display() {
        System.out.printf("Loading"+fileName);
    }

}
