package HW3.model.excersize;

import HW3.model.exceptions.ExcersizeFactoryException;

public interface IExcersizeFactory {
    public BaseExcersize create(String excersizeInfo) throws ExcersizeFactoryException;
}
