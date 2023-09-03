public class Animals implements Comparable<Animals> {
    public Animals(String name){
        this.name = name;
    }
    String name;
    int wiek = 5;

    @Override
    public int compareTo(Animals o) {
        System.out.println(this.name.compareTo(o.name));
        if (this.name.compareTo(o.name) !=0){
            return this.name.compareTo(o.name);
        }
        return o.wiek - this.wiek;

    }
}
