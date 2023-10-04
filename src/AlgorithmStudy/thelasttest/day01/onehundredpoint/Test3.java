package src.AlgorithmStudy.thelasttest.day01.onehundredpoint;

import java.util.*;
import java.util.stream.Collectors;

//
public class Test3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] vlanArr = in.nextLine().split(",");
        int remove = Integer.parseInt(in.nextLine());
        System.out.println(getResult(vlanArr,remove));
    }

    private static String getResult(String[] vlanArr, int remove) {
        LinkedList<Integer[]> vlanlist = Arrays.stream(vlanArr).map(v->Arrays.stream(v.split("-"))
                                        .map(Integer::parseInt).toArray(Integer[]::new)).sorted(Comparator.comparingInt(a -> a[0]))
                                        .collect(Collectors.toCollection(LinkedList::new));
        for (int i = 0; i < vlanlist.size(); i++) {
            Integer[] vlan = vlanlist.get(i);
            int from = vlan[0];
            if (vlan.length > 1){
                int to = vlan[1];
                if (remove < from || remove > to)
                    continue;
                vlanlist.remove();
                if (remove == from){
                    vlanlist.add(i,generateRange(remove + 1,to));
                } else if (remove == 0) {
                    vlanlist.add(i,generateRange(from,remove - 1));
                } else{
                    vlanlist.add(i,generateRange(remove + 1,to));
                    vlanlist.add(i,generateRange(from,remove - 1));
                }
                break;
            } else if (from == remove) {
                vlanlist.remove(i);
                break;
            }
        }
        StringJoiner ans = new StringJoiner(",");
        vlanlist.stream().map(vlan ->{
            StringJoiner sj = new StringJoiner("-");
            for (Integer v:vlan)
                sj.add(String.valueOf(v));
            return sj.toString();
        }).forEach(ans::add);
        return ans.toString();
    }

    private static Integer[] generateRange(int from, int to) {
        if (from < to){
            return new Integer[]{from,to};
        }else {
            return new Integer[]{from};
        }
    }
}
