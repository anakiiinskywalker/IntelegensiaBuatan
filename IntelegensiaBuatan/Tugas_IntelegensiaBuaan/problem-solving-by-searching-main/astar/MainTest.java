package astar;

import astar.Node;
import astar.Astar;
import astar.NodeUCS;

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

        NodeUCS unpasSetiabudhiUCS = new NodeUCS(unpasSetiabudhi, 15);
        NodeUCS unpasTamansariUCS = new NodeUCS(unpasTamansari, 8);
        NodeUCS unpasSumatraUCS = new NodeUCS(unpasSumatra, 5);
        NodeUCS unpasLengkongUCS = new NodeUCS(unpasLengkong, 0);

        // Empat objek NodeUCS yaitu unpasSetiabudhiUCS, unpasTamansariUCS, unpasSumatraUCS, dan unpasLengkongUCS dibuat di sini. 
        // Setiap objek NodeUCS memiliki dua argumen, yaitu simpul yang direpresentasikan dan nilai heuristik

        unpasSetiabudhiUCS.addTetangga(unpasTamansariUCS, 6);
        unpasSetiabudhiUCS.addTetangga(unpasLengkongUCS, 30);

        unpasTamansariUCS.addTetangga(unpasSetiabudhiUCS, 6);
        unpasTamansariUCS.addTetangga(unpasSumatraUCS, 3);

        unpasSumatraUCS.addTetangga(unpasTamansariUCS, 3);
        unpasSumatraUCS.addTetangga(unpasLengkongUCS, 4);

        unpasLengkongUCS.addTetangga(unpasSumatraUCS, 4);
        unpasLengkongUCS.addTetangga(unpasSetiabudhiUCS, 30);

        System.out.println("A*");
        // inisialisasi objek AStar
        Astar aStar = new Astar();
        // memanggil fungsi search dari objek aStar dari node aradUCS ke bucharestUCS
        aStar.search(unpasSetiabudhiUCS, unpasLengkongUCS);
        System.out.println();
        /*
         * 
         * author : 
         * Gilang Ramadhan
         * 213040004
         */
    }
}
