package Observer_Pattern;

import java.util.List;

public class Statistics {
    private List<Object> pastTemperature;
    Statistics(List<Object> past){
         this.pastTemperature = past;
    }
        public float getMean(){
            float sum = 0;
            for(Object temp:pastTemperature) {
                sum += (float) temp;
            }
            return sum/pastTemperature.size();
        }

        public float[] getMinMax(){
            Object min=pastTemperature.get(0);
            Object max=pastTemperature.get(0);

            for(Object temp:pastTemperature){
                if((float)min>(float)temp)
                    min = temp;
                if((float)max<(float)temp)
                    max = temp;
            }
            float[] minmax = new float[2];
            minmax[0] = (float)min;
            minmax[1] = (float)max;
            return minmax;
        }
    }

