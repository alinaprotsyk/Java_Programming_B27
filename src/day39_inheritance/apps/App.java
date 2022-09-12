package day39_inheritance.apps;

public class App {
    /*
     - create variables:
        name (app name), version

    - create constructor to initialize the variables

    - create method:
        download()
            Example output: prints $name is downloading version $version
     */
    String name;
    double version;

    public App(String name, double version) {
        this.name = name;
        this.version = version;
    }

    public void download() {
        System.out.println(name + " is downloading version " + version);
    }

    public String toString() {
        return "app{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
