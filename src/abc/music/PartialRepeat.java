package abc.music;

import java.util.List;

public class PartialRepeat extends Repeat {
    private final RepeatFragment fragment;

    public enum RepeatFragment {START, ENDING}

    public PartialRepeat(List<RepeatElement> repeatedLines, List<RepeatElement> endings, RepeatFragment fragment) {
        super(repeatedLines, endings);
        this.fragment = fragment;
        checkRep();
    }

    public RepeatFragment getFragment() {
        return fragment;
    }

    private void checkRep() {
        if (fragment.equals(RepeatFragment.START)) {
            assert repeatedLines != null && endings == null;
        }
    }

    @Override
    public Components getType() {
        return Components.PARTIALREPEAT;
    }
}
