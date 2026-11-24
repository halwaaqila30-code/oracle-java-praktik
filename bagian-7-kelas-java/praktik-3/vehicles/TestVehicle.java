package vehicles;

public class TestVehicle {
    public static void main(String[] args) {
        // Soal 1c: akses static variable sebelum membuat instance
        System.out.println("Manufacturer: " + Vehicle.MAKE);
        System.out.println("Number of vehicles manufactured: " + Vehicle.numVehicles);

        // Soal 1f - 1j: buat vehicle1 dan vehicle2
        Vehicle vehicle1 = new Vehicle("Vision");
        System.out.println("The chassis number is " + vehicle1.getChassisNo());
        System.out.println("The model type is " + vehicle1.getModel());

        Vehicle vehicle2 = new Vehicle("Edict");
        System.out.println("The chassis number is " + vehicle2.getChassisNo());
        System.out.println("The model type is " + vehicle2.getModel());

        // Soal 1l: tampilkan isi vehicle menggunakan toString()
        System.out.println("\n--- Info Awal vehicle1 & vehicle2 ---");
        System.out.println(vehicle1.toString());
        System.out.println(vehicle2.toString());

        // Soal 2a - 2b: ubah static MAKE melalui vehicle2 dan cetak ulang
        vehicle2.setMake("Seer");
        System.out.println("\n--- Setelah MAKE diubah menjadi Seer ---");
        System.out.println(vehicle1.toString());
        System.out.println(vehicle2.toString());

        // Soal 4d - 4e: buat vehicle3 sebagai Vehicle.Engine
        Vehicle.Engine vehicle3 = new Vehicle.Engine("Fortune");
        System.out.println("\nVehicle number " + vehicle3.getChassisNo()
                + " is a " + vehicle3.getModel()
                + " model and has an engine capacity of " + Vehicle.Engine.getCapacity() + "cc");

        // Soal 1m: total jumlah mobil yang diproduksi
        System.out.println("\nNumber of vehicles manufactured: " + Vehicle.numVehicles);
    }
}