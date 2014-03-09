/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CompositeEntityPattern.CompositeEntity;

/**
 *
 * @author nghiatc
 */
public class CompositeEntity {

    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String data1, String data2) {
        cgo.setData(data1, data2);
    }

    public String[] getData() {
        return cgo.getData();
    }
}
