import java.util.ArrayList;

interface AbstractFile {

    static void ls(){};

}

class File implements AbstractFile{

    public String name;

    public File(String name){
        this.name=name;
    }

    public void ls(){
        System.out.println("File: " + name);
    }
    
}


class Directory implements AbstractFile{

    public String name;
    ArrayList<AbstractFile> IncludedFiles = new ArrayList<>();

    public Directory(String name){
        this.name=name;
    }

    public void add(AbstractFile file){
        IncludedFiles.add(file);
    }

    public void ls(){
        System.out.println("Directory:" + name);

        for(AbstractFile element : IncludedFiles){
            System.out.println(element);
        }

    }

}

public class E8Composite{
    public static void main(String[] args){
        
        Directory rootDirectory = new Directory("Root");
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        rootDirectory.add(file1);
        rootDirectory.add(file2);

        Directory subDirectory = new Directory("Sub");
        File file3 = new File("file3.txt");
        File file4 = new File("file4.txt");
        subDirectory.add(file3);
        subDirectory.add(file4);

        rootDirectory.add(subDirectory);

        rootDirectory.ls();

    }
}