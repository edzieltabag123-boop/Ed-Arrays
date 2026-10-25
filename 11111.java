
public class FavoriteThingsArray {
    public static void main(String[] args) {
        // Declare and initialize a String array with 5 favorite things
        String[] favorites = {
            "Food",
            "Music",
            "Basketball",
            "Travel",
            "Family"
        };

        // Print each item numbered from 1 to 5 using a loop
        System.out.println("My Favorite Things:");

        for (int i = 0; i < favorites.length; i++) {
            System.out.println((i + 1) + ". " + favorites[i]);
        }

        // Print the total length of the array
        System.out.println("Total number of favorites: " + favorites.length);
    }
}
