package astar;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String nilai; // nilai untuk menyimpan node
    private List<Node> tetangga; // nilai utnuk menyimpan node tetangga

    public Node(String nilai) { // cosntuctor utnuk menginisialisasi nilai dari node
        tetangga = new ArrayList<>(); // inisilalisasi arraylist tettangga
        this.nilai = nilai;// mengubah nilai parameter
    }

    public void setNilai(String nilai) { // fungsi untuk mengubah nilai dari node
        this.nilai = nilai;
    }

    public String getNilai() { // fungsi untuk return nilai 
        return nilai;
    }

    public void setTetangga(List<Node> tetangga) { // fungsi mengubah tetangga menjadi node 
        this.tetangga = tetangga;
    }

    public List<Node> getTetangga() { // fungsi ujtk return nilai 
        return tetangga;
    }

    public void addTetangga(Node node) { // fungsi untuk menambahkan node
        tetangga.add(node);
    }

    @Override // fungsi untuk mengehcek node apakah sama atau tidak 
    public boolean equals(Object obj) { // 
        if (obj instanceof Node) {
            return ((Node) obj).nilai.equals(this.nilai); // mengembalikan objek dnegan niulai dari node
        }
        return false; // mengembalikan nilai dalse
    }
}
