public class Rectangle {

   private int length;
   private int width;

   //   Constructor

    public Rectangle(int inputLength, int inputWidth){

        this.length = inputLength;
        this.width = inputWidth;
    }
 // Area Method

    public int area(){
        return this.length * this.width;
    }

    public boolean isRectangle(){
        if(this.length == this.width){
            return false;
        }else{
            return true;
        }
    }

}
