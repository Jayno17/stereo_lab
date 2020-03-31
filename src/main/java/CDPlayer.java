public class CDPlayer extends Component{

    private Integer numberOfDiscs;

    public CDPlayer(String name, Integer volume, Integer numberOfDiscs){
        super(name, volume);
        this.numberOfDiscs = numberOfDiscs;
    }

    public Integer getNumberOfDiscs() {
        return numberOfDiscs;
    }

    public void setNumberOfDiscs(Integer numberOfDiscs) {
        this.numberOfDiscs = numberOfDiscs;
    }
}
