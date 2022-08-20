package org.learn.blockchains;

import java.util.List;

public class BlockChain {

    private final List<Block> blockChain;

    public BlockChain() {
        this.blockChain = new LinkedListForBlock();
    }

    public void addBlock(Block block){
        this.blockChain.add(block);
    }

    public List<Block> getBlockChain(){
        return this.blockChain;
    }

    public int getSize(){
        return this.blockChain.size();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Block block : blockChain) {
            stringBuilder.append(block).append("\n");
        }
        return stringBuilder.toString();
    }
}
