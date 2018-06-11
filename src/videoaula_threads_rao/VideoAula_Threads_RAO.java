/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoaula_threads_rao;

/**
 *
 * @author meirinaldojunior
 */
public class VideoAula_Threads_RAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ControladorThreads th1 = new ControladorThreads(1, 10000, 10);
        ControladorThreads th2 = new ControladorThreads(2, 30000, 10);
        ControladorThreads th3 = new ControladorThreads(3, 60000, 10);
        ControladorThreads th4 = new ControladorThreads(4, 80000, 10);

        th1.start();
        th2.start();
        th3.start();
        th4.start();

        try {
            th1.join();
            th2.join();
            th3.join();
            th4.join();
        } catch (Exception e) {
        }

        System.err.println("TERMINOU A EXECUÇÃO");
    }
}
