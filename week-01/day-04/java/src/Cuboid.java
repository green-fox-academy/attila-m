public class Cuboid {

    public static void main(String[] args) {

        double height = 10;
        double width = 15;
        double lenght =20;

        double surface = (2 * lenght * width) + (2 * lenght * height) + (2 * height * width);
        double volume = height * width * lenght;

        System.out.println(surface);
        System.out.println(volume);

    }
}



// Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
//
// Surface Area: 600
// Volume: 1000
