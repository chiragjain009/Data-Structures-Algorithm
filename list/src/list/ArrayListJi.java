package list;
public class ArrayListJi<T>{
    T[] array;
    int index;
    public ArrayListJi(){
        array = (T[]) new Object[10];
        index=-1;
    }
    public ArrayListJi(int initialCapacity){
        array = (T[]) new Object[initialCapacity];
        index=-1;
    }

    public int getSize(){
        return index+1;
    }
    public void clear(){
        array = (T[]) new Object[10];
        index=-1;
    }

    public boolean add(T val){
        index++;
        array[index]=val;
        changeNewSpace();
        return true;
    }
    public boolean add(int i,T val){
        index++;
        array[index]=val;
        changeNewSpace();
        return true;
    }

    public T get(int i){
        if(i>index)throw new ArrayIndexOutOfBoundsException();
        return array[i];
    }

    private void changeNewSpace() {
        if(index>=array.length/2){
            System.out.println("changing size in array prev-"+ array.length);
            T[] temp=(T[]) new Object[array.length*2];
            for(int i=0;i<=index;i++) temp[i]=array[i];
            array=temp;
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append('[');
        for(int i=0;i<index;i++){
            s.append(array[i]+",");
        }
        if(index>=0)s.append(array[index]);
        s.append(']');
        return s.toString();
    }
}
