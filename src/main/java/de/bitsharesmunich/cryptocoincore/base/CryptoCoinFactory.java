package de.bitsharesmunich.cryptocoincore.base;


import de.bitsharesmunich.cryptocoincore.bitcoin.BitcoinManager;
/**
 *
 * @author Henry
 */
public class CryptoCoinFactory {
    

    public static GeneralCoinManager getGeneralCoinManager(Coin coin){
        switch(coin){
            case BITCOIN:
                return BitcoinManager.getInstance();
        }
        
        return null;
    }
    
}
