package Zadanie28;

public class Neuron {
    private final double[] weights;
    private final double bias;
    public Neuron(double[] weights, double bias) {
        this.weights = weights;
        this.bias = bias;  // смещение
    }
    public double sigmoid(double x) {
        return 1 / (1 + Math.exp(-x));
    }
    public double forwardPropagation(double[] inputs) {
        if (inputs.length != weights.length) {
            throw new IllegalArgumentException("Number of inputs does not match the number of weights");
        }
        double sum = 0;
        for (int i = 0; i < inputs.length; i++) {
            sum += inputs[i] * weights[i];
        }
        sum += bias;
        return sigmoid(sum);
    }

    public static void main(String[] args) {
        double[] weights = {0.5, 0.8};
        double bias = -0.2;
        Neuron neuron = new Neuron(weights, bias);
        double[] inputs = {0.2, 0.6};
        double output = neuron.forwardPropagation(inputs);
        System.out.println("Output: " + output);
    }
}
