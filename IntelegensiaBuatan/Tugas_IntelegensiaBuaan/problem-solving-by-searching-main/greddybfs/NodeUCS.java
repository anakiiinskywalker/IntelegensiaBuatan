package greddybfs;

import java.util.ArrayList;
import java.util.List;

public class NodeUCS { // NodeUCS untuk menyimpan nilai yang tedapat dalam nodeucs
    private String nilai; // nilai untuk ntimpan nilai string
    private int cost; // untuk menyimpan biayta dari node

    private List<NodeUCS> tetangga; // Atribut tetangga adalah daftar dari objek NodeUCS.

    public NodeUCS(Node node, int cost) { // konstruktor yang menerima node dan cost sebagai argumen untuk menginisialisasi objek baru.
        this.nilai = node.getNilai(); //this.nilai diisi dengan nilai dari node.
        this.cost = cost; //this.cost diisi dengan nilai dari parameter cost.
        tetangga = new ArrayList<>(); //  untuk menyimpan daftar tetangga dari node saat ini.
    }

    public String getNilai() { // fungsi untuk mngembalikan nilai 
        return nilai;
    }

    public void setNilai(String nilai) { // mengubah nama node menjadi parameter
        this.nilai = nilai;
    }

    public void setCost(int cost) {  // fungsi untuk mengubah nilai biaya dari node
        this.cost = cost;
    }

    public int getCost() { // fungsi untuk mengembalikan nama
        return cost;
    }

    public void setTetangga(List<NodeUCS> tetangga) {   // fungsi untuk mengubah tetangga dari node
        this.tetangga = tetangga;
    }

    public List<NodeUCS> getTetangga() { // fungsi untuk mengembalikan nilai tetangga dari node
        return tetangga;
    }

    public void addTetangga(NodeUCS node) { // fungsi untuk menambahkan tetangga dari node
        tetangga.add(node);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof NodeUCS) {
            return ((NodeUCS) obj).nilai.equals(this.nilai);
        }
        return false;
    }
}
