public class CalculFactorielImpl implements ICalculFactoriel {
    @Override
    public int calculator(int number) {
        if(number < 0){
            throw new IllegalArgumentException("Number must be greater than zero");
        }

        return number <= 1 ? 1 : number * calculator(number - 1);
    }
}
