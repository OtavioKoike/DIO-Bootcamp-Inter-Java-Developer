package one.innovation.digital.threads;

public class ThreadExemplo {

    public static void main(String[] args) {
//       Thread thread = new Thread(new BarraCarregamento2());
//       Thread thread1 = new Thread(new BarraCarregamento3());
//
//       thread.start();
//       thread1.start();
//
//        System.out.println("Nome da Thread: " + thread.getName());
//        System.out.println("Nome da Thread: " + thread1.getName());

//        Se fosse sincrono ele imprimiria as ultimas primeiro
//        Nome da Thread: Thread-1
//        Nome da Thread: Thread-3
//        Rodei Barramento 3
//        Rodei Barramento 2

        GeradorPDF geradorPDF = new GeradorPDF();
        BarraCarregamento barraCarregamento = new BarraCarregamento(geradorPDF);

        geradorPDF.start();
        barraCarregamento.start();

    }

}

class GeradorPDF extends Thread{

    @Override
    public void run(){
        try{
            System.out.println("Iniciar geracao de PDF");
            Thread.sleep(5000);
            System.out.println("PDF Gerado");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

class BarraCarregamento extends Thread{
    private Thread pdf;
    public BarraCarregamento(Thread pdf){
        this.pdf = pdf;
    }
    @Override
    public void run(){
        try{
            while(true){
                Thread.sleep(500);
                //Vai executar enquando a thread pdf estiver viva
                //Ou seja, rodando duas threads ao mesmo tempo
                if(!pdf.isAlive()){
                    break;
                }
                System.out.println("Loading...");
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

class BarraCarregamento2 extends Thread{
    @Override
    public void run(){
        super.run();
        try{
            Thread.sleep(3000);
            System.out.println("Rodei Barramento 2 ");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}


class BarraCarregamento3 extends Thread{
    @Override
    public void run(){
        super.run();
        try{
            Thread.sleep(1000);
            System.out.println("Rodei Barramento 3");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}