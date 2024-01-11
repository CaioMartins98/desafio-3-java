package br.com.caio.purchase.main;

import br.com.caio.purchase.calc.CalcCardBalance;
import br.com.caio.purchase.models.Item;
import br.com.caio.purchase.models.Products;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        CalcCardBalance cardBalance = new CalcCardBalance();
        Scanner scanner = new Scanner(System.in);
        List<Products> productsList = new LinkedList<>();

        int operation = 1;
        double cardLimit = 0;
        String itemPurchase;
        double productPrice = 0;

        System.out.println("Digite o limite do cartão: ");
        cardLimit = scanner.nextDouble();
        cardBalance.setCardBalance(cardLimit);

        while (operation == 1) {

            System.out.println("Digite o nome do produto: ");
            itemPurchase = scanner.next();

            System.out.println("Digite o valor do produto: ");
            productPrice = scanner.nextDouble();
            if (productPrice <= cardLimit) {
                cardLimit -= productPrice;
                cardBalance.setCardBalance(cardLimit);

                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                operation = scanner.nextInt();

                Products product = new Products(itemPurchase, productPrice);
                productsList.add(product);
            } else {
                System.out.println("Limite indiponível!");
                operation = 0;
            }

        }

//        ordenação por preço
//        Collections.sort(productsList);
//        System.out.println("Ordenação por nome: " + productsList);

        if (!productsList.isEmpty()) {
            System.out.println("*******************************");
            System.out.println("COMPRAS REALIZADAS:\n");
            //ordenação por preço
            productsList.sort(Comparator.comparing(Item::getPriceProduct));
            for (Products products : productsList) {
                System.out.println(products);

            }
            System.out.println("\n*******************************");
        }

        cardBalance.showLimit();
    }
}