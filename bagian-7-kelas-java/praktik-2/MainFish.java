class Fish {
    public String typeOfFish;
    public int friendliness;
    private String name;

    // Soal 2: constructor tanpa argumen
    public Fish() {
        this.typeOfFish = "Unknown";
        this.friendliness = 3;
        this.name = "Tanpa Nama";
    }

    // Soal 3: constructor berparameter
    public Fish(String t, int f) {
        this.typeOfFish = t;
        this.friendliness = f;
        this.name = "Tanpa Nama";
    }

    public Fish(String name, String t, int f) {
        this.name = name;
        this.typeOfFish = t;
        this.friendliness = f;
    }

    public String getName() {
        return name;
    }

    public String getTypeOfFish() {
        return typeOfFish;
    }

    // Soal 5: mengembalikan tingkat keramahan ikan
    public int getFriendliness() {
        return friendliness;
    }

    @Override
    public String toString() {
        return name + " (" + typeOfFish + ", keramahan: " + friendliness + ")";
    }
}

public class MainFish {
    // Soal 7: nicestFish menerima dua Fish dan mengembalikan yang keramahan-nya lebih tinggi
    public static Fish nicestFish(Fish f1, Fish f2) {
        if (f1.getFriendliness() >= f2.getFriendliness()) {
            return f1;
        }
        return f2;
    }

    // Soal 8: overloading nicestFish menggunakan variable argument (varargs)
    public static Fish nicestFish(Fish... fishes) {
        if (fishes == null || fishes.length == 0) {
            return null;
        }

        Fish temp = fishes[0];
        for (int i = 1; i < fishes.length; i++) {
            if (fishes[i].getFriendliness() > temp.getFriendliness()) {
                temp = fishes[i];
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        // Soal 6: inisialisasi 2 ikan baru
        Fish amber = new Fish("Amber", "AngelFish", 5);
        Fish james = new Fish("James", "Guppy", 3);

        // Uji nicestFish (2 parameter) - Soal 7
        Fish palingRamahDua = nicestFish(amber, james);
        System.out.println("Hasil nicestFish(amber, james): " + palingRamahDua);

        // Uji nicestFish (varargs) - Soal 8 & 9
        Fish palingRamahVarargs = nicestFish(amber, james);
        System.out.println("Hasil nicestFish varargs: " + palingRamahVarargs);
    }
}