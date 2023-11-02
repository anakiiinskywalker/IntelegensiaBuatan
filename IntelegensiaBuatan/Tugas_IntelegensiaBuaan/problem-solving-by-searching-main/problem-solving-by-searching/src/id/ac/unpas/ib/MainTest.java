package id.ac.unpas.ib;

import id.ac.unpas.ib.bfs.BreadthFirstSearch;
import id.ac.unpas.ib.dls.DepthLimitedSearch;
import id.ac.unpas.ib.ucs.NodeUCS;
import id.ac.unpas.ib.ucs.UniformCostSearch;

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
        
        // Simpul-simpul dihubungkan satu sama lain dengan menggunakan metode addTetangga. 
        // Ini membangun hubungan antara simpul-simpul dalam graf.


        System.out.println("BFS");
        BreadthFirstSearch bfs = new BreadthFirstSearch();
        bfs.search(unpasSetiabudhi, unpasLengkong);
        System.out.println();

        // Pada bagian ini, algoritma Breadth First Search (BFS) diterapkan. Objek bfs dibuat dari kelas BreadthFirstSearch. 
        // Metode search kemudian dipanggil dengan menyediakan simpul awal (unpasSetiabudhi) dan simpul tujuan (unpasLengkong)

        System.out.println("DLS");
        DepthLimitedSearch dls = new DepthLimitedSearch();
        dls.setLimit(10);
        dls.search(unpasSetiabudhi, unpasLengkong);
        System.out.println();

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

        // Seperti pada poin 4, simpul-simpul dihubungkan satu sama lain dalam graf, kali ini menggunakan objek NodeUCS.
        
        System.out.println("UCS");
        UniformCostSearch ucs = new UniformCostSearch();
        ucs.search(unpasSetiabudhiUCS, unpasLengkongUCS);
        System.out.println();

        // Pada bagian ini, algoritma Uniform Cost Search (UCS) diterapkan. Objek ucs dibuat dari kelas UniformCostSearch.
        // Metode search kemudian dipanggil dengan menyediakan simpul awal (unpasSetiabudhiUCS) dan simpul tujuan (unpasLengkongUCS).


        /*
         * 
         * author : 
         * mochamad haykal alvegio hadian 
         * 213040028
         */
    }
}

