package basics.sort;

//class FindDublucates {
     class IntArrray {

        public static void main(String[] args) {

            IntArrray obj = new IntArrray();
            obj.findingDuplucates();

        }
        void findingDuplucates() {
            int [] ar = {3,4,1,3,4,6,7,5,7,3,2,9,3,2,1,9,10};

            for(int i = 0;i<ar.length;i++) {
                for(int j =i+1;j<ar.length-1;j++)
                    if (ar[i]==(ar[j])) {
                        //System.out.println(ar[i]);
                        continue;
                    }
                System.out.println(ar[i]);

            }

        }
    }


