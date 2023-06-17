public class Main {
    public static void main(String[] args) {
        // Membuat objek Buku
        Buku buku1 = new Buku("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 1997);

        // Menampilkan informasi buku
        System.out.println("Judul: " + buku1.getJudul());
        System.out.println("Penulis: " + buku1.getPenulis());
        System.out.println("Tahun Terbit: " + buku1.getTahunTerbit());

        // Mengubah informasi buku
        buku1.setJudul("Harry Potter and the Chamber of Secrets");
        buku1.setPenulis("J.K. Rowling");
        buku1.setTahunTerbit(1998);

        // Menampilkan informasi buku setelah diubah
        System.out.println("\nInformasi Buku Setelah Diubah:");
        System.out.println("Judul: " + buku1.getJudul());
        System.out.println("Penulis: " + buku1.getPenulis());
        System.out.println("Tahun Terbit: " + buku1.getTahunTerbit());
    }
}

    

