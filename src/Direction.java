public enum Direction {
    EAST, WEST, NORTH, SOUTH;
    protected String printDiraction() { // Phuong thuc tuong minh
        String message = "You are moving in " + this +" direction";
        System.out.println(message);
        return message;
    }
    public static void main(String[] args) {
        Direction north = Direction.NORTH;
        System.out.println(north);

       System.out.println("index of EAST: " +  Direction.EAST.ordinal()); // lay ra vi tri cua EAST
       System.out.println("index of EAST: " +  Direction.NORTH.ordinal()); //2); // lay ra vi tri cua EAST
        
        Direction[] directions = Direction.values(); // array enum
        for(Direction d: directions){
            System.out.println(d);
        }
        Direction east = Direction.valueOf("EAST");// lay gia tri thong qua value  of
        System.out.println(east);
        east.printDiraction();

    }
}