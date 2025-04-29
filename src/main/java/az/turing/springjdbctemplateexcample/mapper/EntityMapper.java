package az.turing.springjdbctemplateexcample.mapper;

public interface EntityMapper <E,D>{

    E toEnt(D d);
    D toDto(E e);
}
