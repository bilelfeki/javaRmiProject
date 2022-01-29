import java.rmi.* ; 

public interface ColumnInterface  extends Remote{
    public int[] getColumn()  ;
    public void setColumn(int[] column)  ;
    public int getTaille()  ;
    public void setVal(int place,int val) ; 

}
