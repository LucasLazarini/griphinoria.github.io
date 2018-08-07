/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao_adapter;


public class Padrao_Adapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TomadaDeTresPinos t3 = new TomadaDeTresPinos();
         
        AdapterTomada a = new AdapterTomada(t3);
        a.ligarNaTomadaDeDoisPinos();
    }
    
}
