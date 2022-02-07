package com.arilsondev.blockchain;

import java.math.BigDecimal;
import java.util.List;

public class BlockChainExample {

    public static void main(String[] args) {

        final Transaction transaction1 = Transaction.builder()
                .money(BigDecimal.valueOf(100))
                .sourceName("Peter")
                .destination("Sam")
                .build();

        final Transaction transaction2 = Transaction.builder()
                .money(BigDecimal.valueOf(1000))
                .sourceName("Sam")
                .destination("Ryan")
                .build();

        final Transaction transaction3 = Transaction.builder()
                .money(BigDecimal.valueOf(1000))
                .sourceName("Sam")
                .destination("Ryan")
                .build();

        final Transaction transaction4 = Transaction.builder()
                .money(BigDecimal.valueOf(1000))
                .sourceName("ryan")
                .destination("megan")
                .build();

        Block block1 = Block.builder()
                .previousHash(0)
                .transactions(List.of(transaction1, transaction2))
                .build();

        System.out.println(block1.hashCode());

        Block block2 = Block.builder()
                .previousHash(block1.hashCode())
                .transactions(List.of(transaction3))
                .build();

        System.out.println(block2.hashCode());

        Block block3 = Block.builder()
                .previousHash(block2.hashCode())
                .transactions(List.of(transaction4))
                .build();

        System.out.println(block3.hashCode());


    }
}
