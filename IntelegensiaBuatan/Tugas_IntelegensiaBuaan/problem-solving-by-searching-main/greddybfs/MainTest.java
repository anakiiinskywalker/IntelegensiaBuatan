package greddybfs;

import greddybfs.NodeUCS;
import greddybfs.Greedybfs;
import greddybfs.Node;
import greddybfs.Solusi;

public class MainTest {
    public static void main(String[] args) {
        Node unpasSetiabudhi = new Node("unpasSetiabudhi");
        Node unpasTamansari = new Node("unpasTamansari");
        Node unpasSumatra = new Node("unpasSumatra");
        Node unpasLengkong = new Node("unpasLengkong");
        // Empat objek Node yaitu unpasSetiabudhi, unpasTamansari, unpasSumatra, dan unpasLengkong dibuat di sini.
        //  Masing-masing merepresentasikan simpul dalam graf. Setiap simpul memiliki nama yang diberikan sebagai argumen dalam konstruktor.

        unpasSetiabudhi.addTetangga(unpasTamansari);
        unpasSetiabudhi.addTetangga(unpasLengkong);

        unpasTamansari.addTetangga(unpasSetiabudhi);
        unpasTamansari.addTetangga(unpasSumatra);

        unpasSumatra.addTetangga(unpasTamansari);
        unpasSumatra.addTetangga(unpasLengkong);

        unpasLengkong.addTetangga(unpasSumatra); 
        unpasLengkong.addTetangga(unpasSetiabudhi);
        
        // Pada bagian ini, algoritma Depth Limited Search (DLS) diterapkan. Objek dls dibuat dari kelas DepthLimitedSearch. Batasan kedalaman (10 dalam contoh ini) ditetapkan dengan menggunakan metode setLimit.
        //  Metode search kemudian dipanggil dengan menyediakan simpul awal (unpasSetiabudhi) dan simpul tujuan (unpasLengkong).

        NodeUCS unpasSetiabudhiUCS = new NodeUCS(unpasSetiabudhi, 20);
        NodeUCS unpasTamansariUCS = new NodeUCS(unpasTamansari, 7);
        NodeUCS unpasSumatraUCS = new NodeUCS(unpasSumatra, 6);
        NodeUCS unpasLengkongUCS = new NodeUCS(unpasLengkong, 0);

        // Empat objek NodeUCS yaitu unpasSetiabudhiUCS, unpasTamansariUCS, unpasSumatraUCS, dan unpasLengkongUCS dibuat di sini. 
        // Setiap objek NodeUCS memiliki dua argumen, yaitu simpul yang direpresentasikan dan nilai heuristik

        unpasSetiabudhiUCS.addTetangga(unpasTamansariUCS);
        unpasSetiabudhiUCS.addTetangga(unpasLengkongUCS);

        unpasTamansariUCS.addTetangga(unpasSetiabudhiUCS);
        unpasTamansariUCS.addTetangga(unpasSumatraUCS);

        unpasSumatraUCS.addTetangga(unpasTamansariUCS);
        unpasSumatraUCS.addTetangga(unpasLengkongUCS);

        unpasLengkongUCS.addTetangga(unpasSumatraUCS);
        unpasLengkongUCS.addTetangga(unpasSetiabudhiUCS);

        System.out.println("Greedy BFS");
        // inisialisasi objek GreedyBestFirstSearch
        Greedybfs bfs = new Greedybfs();
        // memanggil fungsi search dari objek GreedyBestFirstSearch dari node aradUCS ke
        // bucharestUCS
        bfs.search(unpasSetiabudhiUCS, unpasLengkongUCS);
        System.out.println();
        /*
         * 
         * author : 
         * mochamad haykal alvegio hadian 
         * 213040028
         */
    }
}


