import pandas as pd
def load_data(file_path):
df=pd.read_csv(file_path)
return df
def find_s_algorithm(df):
positive_examples = df[df.iloc[:,-1].str.lower() == 'yes']
if positive_examples.empty:
return None
hypothesis=list(positive_examples.iloc[0,:-1])
for index,row in positive_examples.iterrows():
for i in range(len(hypothesis)):
if(row[i]!=hypothesis[i]):
hypothesis[i]='?'
return hypothesis
file_path='finds.csv'
data=load_data(file_path)
print("Training data\n")
display(data)
final_hypothesis=find_s_algorithm(data)
print("\n Final Hypothesis (Most Specific)")
print(final_hypothesis)