public abstract class SortList {

    public Entry head;

    public SortList() {
        this.head = new Entry(Integer.MIN_VALUE);
       this.head.next =new Entry(Integer.MAX_VALUE);
    }

    public  abstract  boolean add(Integer obj);
    public  abstract  boolean remove(Integer obj);
    public  abstract  boolean contain(Integer obj);


    public int calculateLength(){
        int length=0;
        Entry curr =this.head;
        while (curr !=null && curr.object != Integer.MAX_VALUE){
            curr=curr.next;
            length++;
        }
        return  length-1;
    }

    public  boolean isSorted(){
        Entry curr =this.head;
        while (curr !=null &&curr.next !=null){
            if(curr.object>curr.next.object){
                return  false;
            }
            curr=curr.next;
        }
        return true;
    }


    public void printList(){
        Entry curr = this.head;
        while (curr != null){
            System.out.println(curr.object);
            curr = curr.next;

        }
    }
}
