package org.learn.blockchains;

public class Miner {
    private double reward;

    public void mine(Block block, BlockChain blockChain){

        // it takes some time to find the valid hash
        // PoW
        while (!isGoldenHash(block)){
            block.incrementNonce();
            block.generateHash();
        }
        System.out.println(block + " has just mined...");
        System.out.println("Hash is: " + block.getHash());
        blockChain.addBlock(block);
        reward += Constants.REWARD;
    }

    private boolean isGoldenHash(Block block) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < Constants.DIFFICULTY; i++) {
            stringBuilder.append('0');
        }
        String leadingZeros = stringBuilder.toString();
        return block.getHash().substring(0,Constants.DIFFICULTY).equals(leadingZeros);
    }

    public double getReward() {
        return this.reward;
    }
}
