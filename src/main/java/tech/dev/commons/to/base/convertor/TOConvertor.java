package tech.dev.commons.to.base.convertor;

import tech.dev.commons.to.base.TransferObject;
import tech.dev.domain.Doc;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe abstraite des TOConvertor
 * <p>
 * Date: 11/12/2018
 *
 * @author d.vornicu
 * @version 1.0 $Revision$ $Date$
 */

public abstract class TOConvertor<D extends Doc, T extends TransferObject> {

    public abstract T document2TO(D doc, boolean fillAll);

    public abstract D fillDocument(T to, D doc) throws Exception;

    public List<T> entityList2TOList(List<D> documentList, boolean fillAll) {
        List<T> toList = new ArrayList<T>();
        for (D d : documentList) {
            toList.add(document2TO(d, fillAll));
        }
        return toList;
    }
}
