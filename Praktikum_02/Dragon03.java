public class Dragon03 {
    int x, y, width, height;
    
    public Dragon03(int x, int y,int width, int height){
        this.x = x;
        this.y = y;
        this.width =width;
        this.height = height;
    }

    void moveLeft(){
        x--;
        if (x < 0 || x >= width){
            detectCollision();
        }
        printPosition();
    }

    void moveRight(){
        x++;
        if (x < 0 || x >= width){
            detectCollision();
        }
        printPosition();
    }

    void moveUp (){
        y--;
        if (y < 0 || y >= height){
            detectCollision();
        }
        printPosition();
    }

    public void moveDown(){
        y++;
        if (y < 0 || y >= height){
            detectCollision();
        }
        printPosition();
    }

    void printPosition (){
        System.out.println("Posisi Dragon: ("  + x + "," + y +")");
    }

    void detectCollision(){
        System.out.println("Game Over");
    }

        public static void main(String[] args){
            Dragon03 dragon = new Dragon03 (3, 3 , 5, 5);
            dragon.moveLeft();
            dragon.moveRight();
            dragon.moveUp();
            dragon.moveDown();
            dragon.printPosition();
        }
    }

