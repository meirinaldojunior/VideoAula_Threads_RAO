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
public class ControladorThreads extends Thread {

    private int id;
    private int delay;
    private int repeticao;

    public ControladorThreads(int id, int delay, int repeticao) {
        this.id = id;
        this.delay = delay;
        this.repeticao = repeticao;
    }
    
    public void run(){
        for(int i = 0; i<repeticao; i++){
            try {
                System.out.println("ID thread: "+id+" | delay: "+delay+" | Repetição: "+repeticao);
                Thread.sleep(delay);
            } catch (Exception e) {
                System.err.println("Erro: "+e.getMessage());
            }
        }
    }

}
