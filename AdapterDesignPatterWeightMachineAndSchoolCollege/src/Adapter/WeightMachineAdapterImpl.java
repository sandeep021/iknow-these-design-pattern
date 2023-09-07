package Adapter;

public class WeightMachineAdapterImpl implements WeightMachineAdapter{

    @Override
    public double getWeightInKG(double weight){
        return weight*0.45;
    }
}
