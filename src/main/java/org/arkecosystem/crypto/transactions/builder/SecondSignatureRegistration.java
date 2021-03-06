package org.arkecosystem.crypto.transactions.builder;

import org.arkecosystem.crypto.encoding.Hex;
import org.arkecosystem.crypto.enums.Types;
import org.arkecosystem.crypto.identities.PublicKey;

public class SecondSignatureRegistration extends AbstractTransaction {

    public SecondSignatureRegistration signature(String signature) {
        this.transaction.asset.signature.publicKey = Hex.encode(PublicKey.fromPassphrase(signature).getBytes());

        return this;
    }

    public Types getType() {
        return Types.SECOND_SIGNATURE_REGISTRATION;
    }

}
