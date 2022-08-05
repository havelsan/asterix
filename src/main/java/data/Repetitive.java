package data;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Repetitive")
public class Repetitive {

    @XStreamAlias("Fixed")
    private Fixed fixed;
}
