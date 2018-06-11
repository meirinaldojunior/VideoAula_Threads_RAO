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

//Extende da classe thread do java
public class ControladorThreads extends Thread {

    private int id;
    private int delay;
    private int repeticao;

    //construtor recebe parametros do main
    public ControladorThreads(int id, int delay, int repeticao) {
        this.id = id;
        this.delay = delay;
        this.repeticao = repeticao;
    }
    
    //metodo que roda as instruções da thread
    public void run(){
        
        //laço de repetição
        for(int i = 0; i<repeticao; i++){
            try {
                //debuga a execução
                System.out.println("ID thread: "+id+" | delay: "+delay+" | Repetição: "+repeticao);
                //delay entre a finalização das threads 
                Thread.sleep(delay);
            } catch (Exception e) {
                System.err.println("Erro: "+e.getMessage());
            }
        }
    }

}
