package kem.anusha.ethereumandroid;

/**
 * Created by Guest1 on 8/24/2017.
 */

import org.web3j.tx.Contract;
        import java.math.BigInteger;
        import java.util.Arrays;
        import java.util.Collections;
        import java.util.concurrent.Future;
        import org.web3j.abi.FunctionEncoder;
        import org.web3j.abi.TypeReference;
        import org.web3j.abi.datatypes.Function;
        import org.web3j.abi.datatypes.Type;
        import org.web3j.abi.datatypes.Utf8String;
        import org.web3j.crypto.Credentials;
        import org.web3j.protocol.Web3j;
        import org.web3j.protocol.core.methods.response.TransactionReceipt;
        import org.web3j.tx.Contract;
        import org.web3j.tx.TransactionManager;

/**
 * Auto generated code.<br>
 * <strong>Do not modify!</strong><br>
 * Please use {@link org.web3j.codegen.SolidityFunctionWrapperGenerator} to update.
 *
 * <p>Generated with web3j version 2.2.1.
 */
public final class Greeter extends Contract {
    private static final String BINARY = "6060604052341561000f57600080fd5b6040516103dc3803806103dc833981016040528080518201919050505b806000908051906020019061004292919061004a565b505b506100ef565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f1061008b57805160ff19168380011785556100b9565b828001600101855582156100b9579182015b828111156100b857825182559160200191906001019061009d565b5b5090506100c691906100ca565b5090565b6100ec91905b808211156100e85760008160009055506001016100d0565b5090565b90565b6102de806100fe6000396000f30060606040526000357c0100000000000000000000000000000000000000000000000000000000900463ffffffff168063cfae321714610049578063d28c25d4146100d8575b600080fd5b341561005457600080fd5b61005c610135565b6040518080602001828103825283818151815260200191508051906020019080838360005b8381101561009d5780820151818401525b602081019050610081565b50505050905090810190601f1680156100ca5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b34156100e357600080fd5b610133600480803590602001908201803590602001908080601f016020809104026020016040519081016040528093929190818152602001838380828437820191505050505050919050506101de565b005b61013d6101f9565b60008054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156101d35780601f106101a8576101008083540402835291602001916101d3565b820191906000526020600020905b8154815290600101906020018083116101b657829003601f168201915b505050505090505b90565b80600090805190602001906101f492919061020d565b505b50565b602060405190810160405280600081525090565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f1061024e57805160ff191683800117855561027c565b8280016001018555821561027c579182015b8281111561027b578251825591602001919060010190610260565b5b509050610289919061028d565b5090565b6102af91905b808211156102ab576000816000905550600101610293565b5090565b905600a165627a7a72305820047a4456984e6f7339eb861171091755a0fe49c2c8c43dda6cf11fb613ac7d430029";

    private Greeter(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    private Greeter(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public Future<TransactionReceipt> kill() {
        Function function = new Function("kill", Arrays.<Type>asList(), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public Future<Utf8String> greet() {
        Function function = new Function("greet",
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<TransactionReceipt> changeGreeting(Utf8String _greeting) {
        Function function = new Function("changeGreeting", Arrays.<Type>asList(_greeting), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public static Future<Greeter> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue, Utf8String _greeting) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(_greeting));
        return deployAsync(Greeter.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor, initialWeiValue);
    }

    public static Future<Greeter> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue, Utf8String _greeting) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(_greeting));
        return deployAsync(Greeter.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor, initialWeiValue);
    }

    public static Greeter load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Greeter(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static Greeter load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Greeter(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }
}
