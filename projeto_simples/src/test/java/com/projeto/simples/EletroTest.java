package com.projeto.simples;

import java.util.Scanner;

public class EletroTest {
    static int categoria, preco, tensao, escolha, fim;
    static boolean continua = true;
    static Scanner kb = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        Geladeira[] geladeira = new Geladeira[6];
        {
            //220V
            geladeira[0] = new Geladeira("Panasonic Frost Free com Painel Eletrônico - 387 L","Branco", "Panasonic", "NR-BT40BD1W", "TIPO C unipolar 6A",
                220, 2499.00, 2.5);
            geladeira[1] = new Geladeira("Refrigerador Top Freezer 474L Platinum","Prata/INOX", "ELECTROLUX", "TF56S", "TIPO C unipolar 6A",
                220, 3399.00, 2.5);
            geladeira[2] = new Geladeira("Frost Free Samsung Evolution 460L","INOX", "SAMSUNG", "RT46K", "TIPO C unipolar 6A",
                220, 4559.05, 2.5);
            //110V
            geladeira[3] = new Geladeira("Refrigerador Electrolux 240L 1 Porta","BRANCO", "ELECTROLUX", "RE31", "TIPO C unipolar 10A",
                110, 1399.00, 2.5);
            geladeira[4] = new Geladeira("Frost Free TF55 com Prateleira Reversível","Branco", "ELECTROLUX", "TF55", "TIPO C unipolar 10A",
                110, 3399.00, 2.5);
            geladeira[5] = new Geladeira("Frost Free Evox - 573L com Smart Bar Ative! ","EVOX", "BRASTEMP", "INVERSE MAXI", "TIPO C unipolar 10A",
                110, 5199.00, 2.5);
        };
        Chuveiro[] chuveiro = new Chuveiro[6];
        {
            chuveiro[0] = new Chuveiro("Ducha Top Banho 4t","Branco", "Sintex", "DT265 – 4 TEMPERATURAS", "TIPO B bipolar 35A",
                220, 78.00, 4, 6500);
            chuveiro[1] = new Chuveiro("Lorenzetti Acqua Ultra Storm","Preto","Lorenzetti", "ACQUA STORM ULTRA – 4 TEMPERATURAS", "TIPO B bipolar 40A",
                220, 287.91, 6, 7800);
            chuveiro[2] = new Chuveiro("Acqua Duo Ultra","Preto e Cromado", "Lorenzetti", "ACQUA DUO ULTRA – 4 TEMPERATURAS", "TIPO B bipolar 40A",
                220, 474.21, 6, 7800);
            chuveiro[3] = new Chuveiro("BELLA DUCHA 4T ","Branco", "Lorenzetti", "7531200 – 4 TEMPERATURAS", "TIPO B unipolar 50A",
                110, 59.99, 10, 5500);
            chuveiro[4] = new Chuveiro("DUCHA ELETRONICA SINTEX","Branco","Sintex", "ELETRONICO – 4 TEMPERATURAS", "TIPO B unipolar 50A",
                110, 151.91, 10,5400);
            chuveiro[5] = new Chuveiro("HYDRA DPQD DP 551BR, DUCHA DIGITAL QUADRATTA PLUS","Branco", "HYDRA", "DPQD.DP.551BR– 4 TEMPERATURAS", "TIPO B unipolar 50A",
                110, 319.00, 10,5500);
        }
        ArCondicionado[] arCondicionado = new ArCondicionado[6];
        {
            arCondicionado[0] = new ArCondicionado("Ar Condicionado Split 9.000 Btus Frio","Branco", "Philco", "PAS9100F1", "TIPO C unipolar 10A",
                    220, 1098.90, 2.5,9000);
            arCondicionado[1] = new ArCondicionado("Ar Condicionado Split HW Inverter Daikin Advance","Branco", "DAIKIN", "PAS9100F1", "TIPO C unipolar 10A",
                    220, 2514.74, 2.5,12000);
            arCondicionado[2] = new ArCondicionado("Ar Condicionado Split Digital Inverter Samsung 22000","Branco", "Samsung", "AR24NVFPCWKNAZ", "TIPO C unipolar 16A",
                    220, 3695.12, 2.5, 22000);
            arCondicionado[3] = new ArCondicionado("Split Hw Dual Inverter Lg 12000 Btus Frio","Branco", "LG", "S4NQ12JA3WF.EB1GAMZ", "TIPO C unipolar 15A",
                    110, 2268.64, 2.5,9000);
            
            arCondicionado[4] = new ArCondicionado("Ar Condicionado Portátil Dual Inverter LG Voice","Branco", "LG", "LP1419IVSM. EC1AAMZ", "TIPO C unipolar 15A",
                    110, 4864.85, 2.5,14000);
            arCondicionado[5] = new ArCondicionado("Ar Condicionado Split Hi Wall Fontaine 9.000 BTU/h Frio Monofásico","Branco", "Fontaine", "FONTAINE", "TIPO C unipolar 15A",
                    110, 2268.64, 2.5,12000);
        };

        //tela
        tela();
        //show opcoes de acordo com as informacoes colocadas
        continua = true;
        while(continua)
        {
            if(categoria == 1 && preco <= 10000){
                System.out.println("----------------------------------------------------------");
                for(int i = 0; i < arCondicionado.length; i++ )
                {
                    System.out.println((i+1)+"- "+ arCondicionado[i].getNome());
                }
                System.out.println("----------------------------------------------------------");
                System.out.println(" Escolha um item para ver mais opcoes:  ");
                System.out.println("----------------------------------------------------------");
                escolha = kb.nextInt();

                if( escolha == 1)
                    arCondicionado[0].verInfo();
                else if ( escolha == 2)
                    arCondicionado[1].verInfo();
                else if ( escolha == 3)
                    arCondicionado[2].verInfo();
                else if ( escolha == 4)
                    arCondicionado[3].verInfo();
                else if ( escolha == 5)
                    arCondicionado[4].verInfo();
                else if ( escolha == 6)
                {
                    arCondicionado[5].verInfo();
                }         
            }
            else if(categoria == 2 && preco < 10000)
            {
                System.out.println("----------------------------------------------------------");
                for(int i = 0; i < chuveiro.length; i++ )
                {
                    System.out.println((i+1)+"- "+ chuveiro[i].getNome());
                    
                }
                System.out.println("----------------------------------------------------------");
                System.out.println("Escolha um item para ver mais opcoes: ");
                System.out.println("----------------------------------------------------------");
                escolha = kb.nextInt();
                if( escolha == 1)
                    chuveiro[0].verInfo();
                else if ( escolha == 2)
                    chuveiro[1].verInfo();
                else if ( escolha == 3)
                    chuveiro[2].verInfo();
                else if ( escolha == 4)
                    chuveiro[3].verInfo();
                else if ( escolha == 5)
                    chuveiro[4].verInfo();
                else if ( escolha == 6)
                {
                    chuveiro[5].verInfo();
                }
            }
            else if(categoria == 3 && preco < 10000)
            {
                System.out.println("----------------------------------------------------------");
                for(int i = 0; i < geladeira.length; i++ )
                {
                    System.out.println((i+1)+"- "+ geladeira[i].getNome());
                    
                }
                System.out.println("----------------------------------------------------------");
                System.out.println("Escolha um item para ver mais opcoes: ");
                System.out.println("----------------------------------------------------------");
                escolha = kb.nextInt();
                if( escolha == 1)
                    geladeira[0].verInfo();
                else if ( escolha == 2)
                    geladeira[1].verInfo();
                else if ( escolha == 3)
                    geladeira[2].verInfo();
                else if ( escolha == 4)
                    geladeira[3].verInfo();
                else if ( escolha == 5)
                    geladeira[4].verInfo();
                else if ( escolha == 6)
                {
                    geladeira[5].verInfo();
                }
                
            }
            System.out.println("----------------------------------------------------------");
            System.out.println("Deseja sair(0) ou voltar para o menu principal(-6):");
            System.out.println("----------------------------------------------------------");
            fim = kb.nextInt();
            if( fim == 0)
            {
                continua = false;
            }
            else if( fim == -6)
            {
                tela();
                continua =true;
            }
            else 
            {
                System.out.println("opcao Invalida!");
            }
        }

        //termina
    }

    public static void tela()
    {
        while(continua)
        {
            System.out.println("------------------------------------------------------------");
            System.out.println("|\t\tSeja Bem Vindo ao EletriciJava\t\t   |");
            System.out.println("|Programa feito para auxiliar na instalacao" 
                                +"da fiacao de    |\n|certos eletronicos\t\t\t\t\t   |");

            System.out.println("|escolha uma categoria de produto ou digite '0' para sair: |"
                            + "\n|1- ArCondicionado\t\t\t\t\t   |\n"
                            + "|2- Chuveiro\t\t\t\t\t\t   |\n|3- Geladeira\t\t\t\t\t\t   |");
            System.out.println("------------------------------------------------------------");
            categoria = kb.nextInt();
            if (categoria == 1 || categoria == 2 || categoria == 3 )
            {
                System.out.println("----------------------------------------------------------------");
                System.out.println(
					"Digite valores entre R$100 e R$10000 " + "\n0 - Voltar para o menu" + " ou -6 - Sair do programa");
                    System.out.println("----------------------------------------------------------------");
                    preco = kb.nextInt();    

                if(preco == 0)
                {
                    continua = false;
                }
                else if (preco == -6)
                {
                    continue;
                }
                else
                {
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("Digite a voltagem do produto em relação a tensão 110 ou 220?");
                    System.out.println("--------------------------------------------------------------");
                    tensao = kb.nextInt();

                    if( tensao == 110 || tensao == 220)
                    {
                        continua = false;
                    }
                    else if ( tensao == -6)
                    {
                        continue;
                    }
                    else if ( tensao == 0)
                    {
                        continua = false;
                    }
                    else 
                    {
                        System.out.println("Invalido!!");
                    }
                }

            }
            else if( categoria == 0)
            {
                continua = false;
            }
            else
            {
                System.out.println("Opcao Invalida! ");
            }
        }
    }

}


