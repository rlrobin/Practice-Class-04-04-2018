
public class SecnSm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int List[]={7,29,18,72,20,12};
int Smallest=List[0];
int SecondSmallest=List[1];
	for (int i=0; i<List.length; i++)
	{
		if (Smallest>List[i])
		{
			Smallest=List[i];
		}
	}
	for (int i=0; i<List.length; i++)
	{
		if (Smallest<List[i]&&List[i]<SecondSmallest)
		{
			SecondSmallest=List[i];
		}
	}
		System.out.println(SecondSmallest);
}

}
