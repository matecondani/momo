package ar.com.momo.monster.mobile.service;

import org.springframework.stereotype.Service;
import  ar.com.momo.monster.mobile.model.entity.Wallet;

@Service
public class WalletService {

    public Wallet initialWallet(){
        return new Wallet(100,5);
    }
}
