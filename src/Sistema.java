import java.io.*;

public class Sistema {
    BufferedReader br;
    Companhia companhia;
    Voo vooTeste;
    Integer contador = 0;

    public static void main(String[] args) throws IOException {
        Sistema sis = new Sistema();
        sis.companhia = new Companhia();
        sis.br = new BufferedReader(new InputStreamReader(System.in));
        sis.menu();

    }

    public void menu() throws IOException {

        String leituraMenu;
        String opcao = "";
        while (!opcao.equals("0")) {
            System.out.println("\n-------------------------");
            System.out.println("MENU");
//            System.out.println("[1] Cadastrar novo passageiro");
            System.out.println("[1] Cadastrar novo voo");
            System.out.println("[2] Cadastrar nova companhia");
            System.out.println("[3] Listar voos");
            System.out.println("[4] Listar companhias");
            System.out.println("[5] Listar passageiros em um voo");
            System.out.println("[6] Listar acentos livres em um voo");
            System.out.println("[0] Sair");
            System.out.println();
            opcao = this.br.readLine();

//            if (opcao.equals("1")) {
//                this.cadastrarPas();
//            } else
            if (opcao.equals("1")) {
                this.cadastrarVoo();
            } else if (opcao.equals("2")) {
                this.cadastrarComp();
            } else if (opcao.equals("3")) {
                this.listarVoo();
            } else if (opcao.equals("4")) {
                this.listarComp();
            } else if (opcao.equals("5")) {
                this.consultarVoo();
            } else if (opcao.equals("6")) {
                leituraMenu = this.br.readLine();
                this.listarAcenLiv(Integer.parseInt(leituraMenu));
            } else if (opcao.equals("0")) {
                System.out.println("Encerrando...");
            } else {
                System.out.println("Opção inválida...");
            }

        }
        br.close();
    }

    //1
//    public void cadastrarPas() {
//        try {
//            for (int i = 0; i < 1; i++) {
//                System.out.println("\n----------------------");
//                System.out.println("Novo passageiro ");
//                Passageiro passageiro = new Passageiro();
//                System.out.println("Nome: ");
//                passageiro.setNome(this.br.readLine());
////                System.out.println("Número do Voo: ");
////                String numeroVoo = this.br.readLine();
////                passageiro.setVoo(Integer.parseInt(numeroVoo));
//                System.out.println("CPF: ");
//                passageiro.setCpf(this.br.readLine());
//                System.out.println("Número de telefone: ");
//                String fonePas = this.br.readLine();
//                passageiro.setFone(Integer.parseInt(fonePas));
//                System.out.println("Acento: ");
//                String acentoPas = this.br.readLine();
//                passageiro.setAcento(Integer.parseInt(acentoPas));
////                voo.setVetPassageiro(Integer.parseInt(acentoPas),passageiro);
//                System.out.println("\n----------------------");
//                System.out.println("Passageiro cadastrado com sucesso!");
//            }
//        } catch (Exception e1) {
//            System.out.println("Formato inválido...");
//        }
//    }
//


    //2
    public void cadastrarVoo() {
        try {
            Voo voo = new Voo();
            System.out.println("\n----------------------");
            System.out.println("Novo Voo");
            System.out.println("Número do voo: ");
            String numVoo = this.br.readLine();
            voo.setNumVoo(Integer.parseInt(numVoo));
            System.out.println("Saída: ");
            String saida = this.br.readLine();
            voo.setSaida(saida);
            System.out.println("Destino: ");
            String destino = this.br.readLine();
            voo.setDestino(destino);
            System.out.println("Acento: ");
            String acentoPas = this.br.readLine();
            voo.setAcento(Integer.parseInt(acentoPas));
            System.out.println("\n----------------------");
            System.out.println("Voo cadastrado com sucesso!");


            for (int i = 0; i < 2; i++) {
                System.out.println("\n----------------------");
                System.out.println("Novo passageiro ");
                Passageiro passageiro = new Passageiro();
                System.out.println("Nome: ");
                passageiro.setNome(this.br.readLine());
//                System.out.println("Número do Voo: ");
//                String numeroVoo = this.br.readLine();
//                passageiro.setVoo(Integer.parseInt(numeroVoo));
                System.out.println("CPF: ");
                passageiro.setCpf(this.br.readLine());
                System.out.println("Número de telefone: ");
                String fonePas = this.br.readLine();
                passageiro.setFone(Integer.parseInt(fonePas));

                System.out.println("\n----------------------");
                System.out.println("Passageiro cadastrado com sucesso!");
                this.companhia.setVoos(voo,i);
            }


        } catch (Exception e1) {
//            System.out.println("Formato inválido... " + e1);
        }
    }

//3
    public void cadastrarComp() {
        try {
            Companhia companhia = new Companhia();
            System.out.println("Nome da empresa: ");
            String nomeComp = this.br.readLine();
            companhia.setNome(nomeComp);
            System.out.println("CNPJ: ");
            companhia.setCnpj(this.br.readLine());
//            System.out.println("Quantidade de Vôos: ");
//            String qntdVoo = this.br.readLine();
//            companhia.setQtdeVoos(Integer.parseInt(qntdVoo));
            System.out.println("\n----------------------");
            System.out.println("Companhia cadastrada com sucesso!");
            contador++;


        } catch (Exception e1) {
            System.out.println("Formato inválido...");
        }
    }

    //4
    public void listarVoo () {
        System.out.println("------------------------");
        System.out.println("Relatório de Voos");
        for (int i = 0; i < 3; i++) {
            String linha = "Numero: " + this.companhia.getVoos(i).getNumVoo();
            System.out.print(linha);

            linha = " - Saída: " + this.companhia.getVoos(i).getSaida();
            System.out.print(linha);

            linha = " - Destino: " + this.companhia.getVoos(i).getDestino();
            System.out.print(linha + "\n");
        }

    }
    //5
    public void listarComp () {
        System.out.println("------------------------");
        System.out.println("Companhias");
        for(int i = 0; i < this.contador; i++){
            String linha = "Nome: " + companhia.getNome();
            System.out.print(linha);

            linha = " - CNPJ: " + this.companhia.getCnpj();
            System.out.print(linha);
        }
    }

    //6
    public void consultarVoo (){
        try {
            System.out.println("------------------------");
            System.out.println("Consulta de Voo");
            System.out.println("Informe o numero da Voo: ");
            Integer numVoo = Integer.parseInt(this.br.readLine());
            boolean achou = false;

            Voo voo;
            for (int i = 0; i < 3; i++) {

                voo = this.companhia.getVoos(i);
                if (voo.getNumVoo() == numVoo) {
                    System.out.println("Passageiros do Voo:");
                    int acento = 0;
                    while (voo.getVetPassageiro(acento) != null) {
                        String linha = "Saída: " + voo.getSaida();
                        System.out.print(linha);

                        linha = " - Destino: " + voo.getDestino();
                        System.out.println(linha);
                        acento++;
                    }
                    achou = true;
                    break;
                }
            }
            if (!achou) {
                System.out.println("Voo não encontrado!");
            }
        } catch (Exception e1) {
            System.out.println("Formato inválido...");
        }
    }

    //7
    public void listarAcenLiv (Integer vooX){
        System.out.println("------------------------");
        Integer vagas = 0;
        for(int i =0; i<3;i++) {
            if (this.companhia.getVoos(i).getNumVoo() == vooX){
                for (Integer iPas = 0 ; iPas < 25 ; iPas++) {
                    if (this.companhia.getVoos(i).getVetPassageiro(iPas)==null)
                     vagas++;
                }
            }
        }
        System.out.println("Quantidade de acentos vagos: " + vagas);
    }


}






