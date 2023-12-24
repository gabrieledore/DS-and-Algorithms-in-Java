public class Day11 {
    public static void main(String[] args) {
        hanoiTower(5, 1, 3);
    }


    private static void hanoiTower(int disks, int sourceRod, int destinationRod) {

        if(disks == 1){
            System.out.printf("Move %d from %d -> %d\n", disks, sourceRod, destinationRod);
        } else{
            int otherRod = 6 - (sourceRod + destinationRod);
            hanoiTower(disks -1, sourceRod, otherRod);
            System.out.printf("Move %d from %d -> %d\n", disks, sourceRod, destinationRod);
            hanoiTower(disks -1, otherRod, destinationRod);
        }
    }


}
