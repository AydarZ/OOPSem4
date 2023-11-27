package Classes;



public class Box<T> {
    private T obj;
    private String name;

    public String getName() {
        return name;
    }

    public Box(T obj, String name) {
        this.obj = obj;
        this.name = name;

    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public void printBoxContents() {
        System.out.println(obj.getClass().getName() + "  " + name + "  " +  obj);
    }

}
