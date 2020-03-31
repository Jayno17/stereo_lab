public class RecordDeck extends Component implements IPlay{

    private Integer speed;
    private String record;
    private Boolean isPlaying;


    public RecordDeck(String name, Integer volume, Integer speed, String record, Boolean isPlaying){
        super(name, volume);
        this.speed = speed;
        this.record = record;
        this.isPlaying = isPlaying;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public void Play(String item){
        if (this.record == item){
            this.isPlaying = true;
        }
        else{
            this.isPlaying = false;
        }
    }
    public void Stop(String item){
        if (this.record == item && this.isPlaying){
            this.isPlaying = false;
        }
    }

    public Boolean getIsPlaying(){
        return isPlaying;
    }

}
